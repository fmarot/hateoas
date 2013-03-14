/**
 * 
 */
package com.zenika.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zenika.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
