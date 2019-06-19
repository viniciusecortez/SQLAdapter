# SQL Adapter [![Build Status](https://travis-ci.com/viniciusecortez/SQLAdapter.svg?branch=master)](https://travis-ci.com/viniciusecortez/SQLAdapter)

## Description
It was noticed that when some of students has difficulty when they are using the database. Considering it, it was possible creating new classes that have all params the student need to using query from databases inside their code.

## Classes

Class name | Description
---|---
SQL | Main class, it is mother of all other classes
MySQL | Class that references the Database Manager MySQL
MariaDB | Class that references the Database Manager MariaDB
SQLite | Class that references the Database Manager SQLite


## How to use
To use you will need to include in your project the .jar that will be available over here. 

You can use these methods from these classes:

Method | Description
---|---
**contructor** | The constructor will receive one argument that is about the address where are localized your database.  At the moment you initialize it, you will have a connection openned. 
.exec(String) | Execute query that are related with the structure of the database, as the tables, procedures...
.query(String)