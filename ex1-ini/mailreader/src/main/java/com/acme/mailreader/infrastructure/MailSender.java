package com.acme.mailreader.infrastructure;

import com.acme.mailreader.domain.Mail;

public interface MailSender {
	void envoyerMail(Mail mail);
}
