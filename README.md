# ⚡ Electricity Billing System

This is a **Java-based GUI application** for managing electricity billing operations. It supports user login, customer registration, bill generation, payment processing, and more — all built using **Java Swing** and **MySQL (JDBC)**.

> 👨‍💻 Developed by [Sujal Chouksey].
> 🛠 IDE Used: IntelliJ IDEA\
> 💾 Database: MySQL\
> 📚 Libraries: JDBC (MySQL Connector/J)

---

## ✨ Features

- 👤 User login system for secure access
- 🧾 Add and manage customer details
- 📊 Generate and view electricity bills
- 💸 Pay bills securely
- 📄 View and print past bills
- 🖼️ Interactive and user-friendly Swing-based GUI

---

## 🗂️ Project Structure

- `Splash.java` – Intro splash screen
- `Login.java` – User authentication
- `Project.java` – Main system dashboard
- `new_customer.java` – Add customer form
- `customer_details.java` – Show/edit customer data
- `generate_bill.java` – Bill calculation and generation
- `pay_bill.java` – Payment interface
- `LastBill.java` – View last bill
- `conn.java` – JDBC connection setup

---

## 🛢️ Database Schema (MySQL)

Create a database named `electricity_db` with the following tables:

### `Login`

| username | password |
| -------- | -------- |

### `Emp`

| name | meter\_number | address | state | city | email | phone |
| ---- | ------------- | ------- | ----- | ---- | ----- | ----- |

### `Bill`

| meter\_number | units | month | amount |
| ------------- | ----- | ----- | ------ |

### `Tax`

| meter\_location | meter\_type | phase\_code | bill\_type | days | meter\_rent | mcb\_rent | service\_rent | gst |
| --------------- | ----------- | ----------- | ---------- | ---- | ----------- | --------- | ------------- | --- |

---

## 🔧 Technologies Used

- **Java** (JDK 8+)
- **Swing** for GUI
- **JDBC** for database connection
- **MySQL** for data storage
- **IntelliJ IDEA** as IDE

---

## 📸 Screenshots
![Main](https://github.com/user-attachments/assets/eee0a142-9437-4ade-9612-76f2f9f3e8d3)
![Login](https://github.com/user-attachments/assets/004e5168-4f81-45aa-8958-94fc2dd7e5f6)
![GenerateBill](https://github.com/user-attachments/assets/f05bdd7c-9626-4d01-b45d-42384ee577d0)
![Details](https://github.com/user-attachments/assets/66b30699-6b25-400a-a7bb-69d7c4f61c6a)
![CalculateBill](https://github.com/user-attachments/assets/1b9128c6-8de9-4e03-b489-71a9ee783b54)
![AddC](https://github.com/user-attachments/assets/768519c2-268c-4cbc-acb1-0b75768a0150)




