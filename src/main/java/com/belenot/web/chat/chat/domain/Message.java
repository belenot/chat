package com.belenot.web.chat.chat.domain;

import java.time.LocalDateTime;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    private Participant participant;
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalDateTime time = LocalDateTime.now();
    @Type(type =  "text")
    @Basic(fetch = FetchType.EAGER)
    private String text;
}