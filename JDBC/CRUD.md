📘 JDBC & SQL CRUD Cheat Sheet
1. The Quick Reference Table

Use this to quickly remember the SQL command and the Java method required for each action.
| Operation | Action | SQL Syntax Example | JDBC Method to Use | Returns |
| :--- | :--- | :--- | :--- | :--- |
| **C**reate | Insert new data | `INSERT INTO users (name) VALUES ('Bob');` | `statement.executeUpdate(sql)` | `int` (Rows affected) |
| **R**ead | Fetch data | `SELECT * FROM users;` | `statement.executeQuery(sql)` | `ResultSet` (The data) |
| **U**pdate | Change data | `UPDATE users SET role = 'Admin' WHERE id = 1;` | `statement.executeUpdate(sql)` | `int` (Rows affected) |
| **D**elete | Remove data | `DELETE FROM users WHERE id = 1;` | `statement.executeUpdate(sql)` | `int` (Rows affected) |