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
![Main](https://github.com/user-attachments/assets/18ab544c-6f74-4e0f-b588-8a0511fda05f)
![GenerateBill](https://github.com/user-attachments/assets/98884237-8e22-49f0-8cfd-4d8faf67bf75)
![Details](https://github.com/user-attachments/assets/154b7f81-5bcc-4832-a5a3-8f545052a273)
![CalculateBill](https://github.com/user-attachments/assets/a5d7d5b1-ab35-4aef-bd54-ee7499a8e211)
![AddC](https://github.com/user-attachments/assets/792061f6-377d-435c-9a61-88dffbb00aee)






