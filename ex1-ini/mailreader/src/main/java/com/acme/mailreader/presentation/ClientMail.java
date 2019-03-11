package com.acme.mailreader.presentation;

public class ClientMail {
	
	private static boolean production;
	private static String sujetMail;
	
	public static void main(String[] args) {
		production = Boolean.parseBoolean(args[0]);
		sujetMail = String.valueOf(args[1]);
	}
	
}
