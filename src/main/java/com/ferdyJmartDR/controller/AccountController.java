package com.ferdyJmartDR.controller;

/**
 * @author Mochamad Ferdy Fauzan
 * @version 17-12-2021
 */

import com.ferdyJmartDR.Account;
import com.ferdyJmartDR.Algorithm;
import com.ferdyJmartDR.Store;
import com.ferdyJmartDR.dbjson.JsonAutowired;
import com.ferdyJmartDR.dbjson.JsonTable;
import org.springframework.web.bind.annotation.*;
import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/account")
public class AccountController implements BasicGetController<Account>
{
	public static @JsonAutowired(value=Account.class, filepath="C:\\Java\\jmart\\src\\main\\account.json") JsonTable<Account> accountTable;
	public static final String REGEX_EMAIL = "^[a-zA-Z0-9&_*~]+(?:\\.[a-zA-Z0-9&_*~]+)*@[A-Za-z0-9]{1}[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9-]+)*$";
	public static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
	public static final Pattern REGEX_PATTERN_EMAIL = Pattern.compile(REGEX_EMAIL);
	public static final Pattern REGEX_PATTERN_PASSWORD = Pattern.compile(REGEX_PASSWORD);

	public JsonTable<Account> getJsonTable(){
		return accountTable;
	}

	@PostMapping("/login")
	Account login
			(
					@RequestParam String email,
					@RequestParam String password
			)
	{
		for(Account account : accountTable){
			try{
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(password.getBytes());
				byte[] bytes = md.digest();
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < bytes.length; i++){
					sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
				}
				if(account.email.equals(email) && account.password.equals(sb.toString())){
					return account;
				}
			} catch (NoSuchAlgorithmException e){
				e.printStackTrace();
			}

		}
		return null;
	}

	@PostMapping("/register")
	Account register
			(
					@RequestParam String name,
					@RequestParam String email,
					@RequestParam String password
			)
	{
		if((REGEX_PATTERN_EMAIL.matcher(email).find()) && (REGEX_PATTERN_PASSWORD.matcher(password).find()) && !name.isBlank()){
			for(Account account : accountTable){
				if(account.email.equals(email)){
					return null;
				}
			}
			try{
				MessageDigest md = MessageDigest.getInstance("MD5");
				md.update(password.getBytes());
				byte[] bytes = md.digest();
				StringBuilder sb = new StringBuilder();
				for(int i = 0; i < bytes.length; i++){
					sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
				}
				Account newAccount = new Account(name, email, sb.toString(), 0);
				accountTable.add(newAccount);
				return newAccount;
			}catch (NoSuchAlgorithmException e){
				e.printStackTrace();
			}
		}
		return null;
	}

	@PostMapping("/{id}/registerStore")
	Store registerStore(@PathVariable int id, @RequestParam String name, @RequestParam String address, @RequestParam String phoneNumber){
		if(accountTable.contains(accountTable.get(id)) && accountTable.get(id).store == null){
			Store newStore = new Store(name, address, phoneNumber, 0);
			accountTable.get(id).store = newStore;
			return newStore;
		}else{
			return null;
		}
	}

	@PostMapping("/{id}/topUp")
	Account topUp(@PathVariable int id, @RequestParam double balance){
		if(accountTable.contains(accountTable.get(id))){
			accountTable.get(id).balance += balance;
			return accountTable.get(id);
		}else{
			return null;
		}

	}
}