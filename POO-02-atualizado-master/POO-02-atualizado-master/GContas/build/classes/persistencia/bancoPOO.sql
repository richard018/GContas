/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Aluno
 * Created: 27/11/2019
 */
create table usuario(
	nome varchar(100) not null,
	login varchar(100) not null,
	email varchar(100) not null,
	senha varchar(60) not null
);

create table contas(
	concessionario varchar(100) not null,
	descricao varchar(100) not null,
	dataVencimento varchar(100) not null,
	id int serial primary key
);