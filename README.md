# ⚡ Electricity Billing System

A **Java-based Electricity Billing System** that helps manage customer records, generate electricity bills, store billing data in a MySQL database, and provide a simple GUI for efficient electricity management.

This project demonstrates **Java Swing, JDBC, MySQL integration, and CRUD operations** in a real-world billing application.

---

# 🚀 Features

* 👤 Add New Customer
* 📋 View Customer Details
* ⚡ Generate Electricity Bill
* 🧾 View Last Bill
* 📊 Store Billing History in Database
* 🗑 Delete Customer Record
* ✏ Update Customer Information
* 🖼 GUI-based Interface (Java Swing)
* 🗄 MySQL Database Integration

---

# 🛠 Tech Stack

* **Language:** Java
* **GUI:** Java Swing
* **Database:** MySQL
* **Connectivity:** JDBC
* **IDE:** IntelliJ / VS Code
* **Version Control:** Git & GitHub

---

# 📂 Project Structure

```
Electricity-billing-system
│
├── src/
│   ├── AddCustomer.java
│   ├── CalculateBill.java
│   ├── LastBill.java
│   ├── Project.java
│   ├── Splash.java
│   └── Conn.java
│
├── images/
│   └── (GUI images used in project)
│
├── database/
│   └── electricity.sql
│
└── README.md
```

---

# 🗄 Database Setup (MySQL)

Create database:

```sql
CREATE DATABASE electricity;
USE electricity;
```

Create customer table:

```sql
CREATE TABLE customer(
    meter_no VARCHAR(20),
    name VARCHAR(20),
    address VARCHAR(50),
    city VARCHAR(20),
    state VARCHAR(20),
    email VARCHAR(30),
    phone VARCHAR(15)
);
```

Create bill table:

```sql
CREATE TABLE bill(
    meter_no VARCHAR(20),
    month VARCHAR(20),
    units VARCHAR(20),
    totalbill VARCHAR(20),
    status VARCHAR(20)
);
```

---

# ⚙️ How to Run Project

### 1. Clone Repository

```bash
git clone https://github.com/sujal-09/Electricity-billing-system.git
```

---

### 2. Open in IDE

Open project in:

* IntelliJ IDEA
* VS Code
* Eclipse

---

### 3. Configure Database

Update database credentials inside:

```
Conn.java
```

Change:

```java
c = DriverManager.getConnection(
"jdbc:mysql:///electricity",
"username",
"password"
);
```

---

### 4. Run Project

Run:

```
Splash.java
```

OR

```
Project.java
```

---

# 🖥 Application Screens

### Login / Splash Screen

GUI based startup screen for system access.

### Add Customer

Add new electricity customer with meter number.

### Generate Bill

Calculate bill using units consumed.

### View Last Bill

Displays previously generated bill.

### Customer Details

Shows all registered customers.

---

# 🔄 System Workflow

1. Add Customer
2. Store in MySQL Database
3. Generate Bill using Units
4. Save Bill in Database
5. View / Print Bill

---

# 📸 Screenshots

(Add your project screenshots here)

Example:

```
![Dashboard](images/dashboard.png)
![Add Customer](images/addcustomer.png)
![Generate Bill](images/bill.png)
```

---

# 🎯 Future Improvements

* Export Bill to PDF
* Admin Login Authentication
* Search Customer Feature
* Bill Payment Integration
* Unit Rate Configuration
* Dark Mode UI

---

# 👨‍💻 Author

**Sujal Chouksey**

GitHub:
https://github.com/sujal-09

---

# ⭐ If you like this project

Give it a ⭐ on GitHub and share!
