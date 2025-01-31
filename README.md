[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/1oOjCPDs)

# Employee Management App

## Overview
The Employee Management App enables both administrators and employees to manage employee details, view holiday information, and update profiles. The app provides an  interface where employees can manage their personal details, and admins perform CRUD operations on employees and review leave requests.

## Features
- **Employee Profile Management**: Employees can view and update their personal information, including first name, last name, email, department, salary, joining date, and leave balances.
- **Admin Management**: Admins can view and manage employee details, track leave requests, and supervise employee records.
- **Holiday Information**: Employees and admins can view and manage holiday requests.
- **Security**: Secure login for both employees and admins, including authentication processes.

## Login Details
### Employee
- **Username**: `employee`
- **Password**: `employee123`

### Admin
- **Username**: `admin`
- **Password**: `admin123`

## Installation Instructions
1. Clone the repository:
    ```sh
    git clone <repository-url>
    ```
2. Open the project in Android Studio.
3. Sync the project with Gradle to download necessary dependencies.

## Running the Application
1. Open the project in Android Studio.
2. Connect an Android device or start an emulator.
3. Click the **Run** button in Android Studio to build and run the application.

## Tips
### Admin Navigation
The bottom navigation menu is organized from left to right:
1. **Profile**: View and edit the admin's profile.
2. **Staff Details**: View and manage employee records.
3. **Holiday Requests**: Review and approve/decline leave requests.
4. **Settings**: Manage app settings.

### Employee Navigation
The bottom navigation menu is organized from left to right:
1. **Dashboard**: View general employee information.
2. **Profile**: View and edit the employee's personal details.
3. **Holiday Request**: Submit holiday requests.
4. **Settings**: Manage app settings.

## API Endpoints
All API endpoints used for managing employee data and holiday requests are located in the `networkRequestFile` for communication between the app and the server.

## Database Structure
All Database Structures are located in the `DatabaseHelper` file.

The app utilizes a database to store the following information:
- **Notification Storage**: Stores user notifications.
- **Holiday Request Storage**: Tracks holiday requests made by employees.
- **Employee Profile Data**: Stores personal and professional details of employees.
- **Login Credentials**: Stores usernames and passwords for employees and admins.

### Sample Data
#### Employee Data
- **Employee 1 (Admin)**:
    - **First Name**: Henry
    - **Last Name**: Reid
    - **Email**: henryreid@example.com
    - **Department**: Engineering
    - **Salary**: 60000
    - **Joining Date**: 2022-01-15
    - **Leave Balance**: 30 days

- **Employee 2 (Employee)**:
    - **First Name**: Ben
    - **Last Name**: Smith
    - **Email**: ben.smith@example.com
    - **Department**: Marketing
    - **Salary**: 55000
    - **Joining Date**: 2021-05-20
    - **Leave Balance**: 30 days

#### Holiday Requests
- **Holiday Request 1 (Ben Smith)**:
    - **Start Date**: 2024-01-10
    - **End Date**: 2024-01-15
    - **Reason**: Medical Leave
    - **Status**: Pending
    - **Request Date**: 2023-12-20

- **Holiday Request 2 (Ben Smith)**:
    - **Start Date**: 2024-04-20
    - **End Date**: 2024-04-25
    - **Reason**: Conference Attendance
    - **Status**: Pending
    - **Request Date**: 2024-04-01

- **Holiday Request 3 (Ben Smith)**:
    - **Start Date**: 2024-05-10
    - **End Date**: 2024-05-15
    - **Reason**: Vacation
    - **Status**: Pending
    - **Request Date**: 2024-05-01

## General Concerns
- **Reloading the App**: If data updates are not visible, try reloading the app by navigating through the menu or using the designated refresh button.
- **Postman for Testing**: If the reload method doesn't work, use Postman to verify changes, particularly for updating employee data.
- **Holiday Notifications**: After approving or declining a holiday request, employees must enable notifications by clicking **Allow Notifications** when the prompt appears. Reload the dashboard to view the notifications outside of the app. To disable notifications, toggle the setting off via the **Settings** page.

## License
This project is licensed under the MIT License. See the LICENSE file for details.
