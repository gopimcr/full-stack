
# Patient Care Tracker

A simple full-stack web application built to demonstrate healthcare domain capabilities using Java, Spring Boot, Angular, and H2.

## 🔧 Tech Stack
- **Backend:** Java 11, Spring Boot, H2 Database (can be replaced with SQLite)
- **Frontend:** Angular 14+, TypeScript, Bootstrap
- **Build Tools:** Maven, Angular CLI
- **API Communication:** RESTful APIs
- **Dev Tools:** Postman, Git, VSCode/IntelliJ

## 📚 Features
- Create, read, update, and delete (CRUD) patient records
- View list of patients
- Simple UI with responsive Bootstrap table
- Clean REST APIs with validation and error handling
- Fully CORS enabled for frontend-backend integration

## 📁 Project Structure
```
PatientCareTracker/
├── backend/
│   └── src/
│       └── main/java/com/cvshealth/pct/
│           ├── controller/
│           ├── model/
│           ├── repository/
│       └── resources/
├── frontend/
│   └── src/app/
│       ├── components/patient-list/
│       ├── models/
│       └── services/
```


## 📌 API Endpoints
- `GET /api/patients` - List all patients
- `POST /api/patients` - Add new patient
- `PUT /api/patients/{id}` - Update patient
- `DELETE /api/patients/{id}` - Delete patient

## 📃 Notes
- Angular consumes REST APIs via HttpClient
- Simple demo for showcasing full-stack development skills in a healthcare-like domain

**Gopi Krishna** – Full Stack Java + Angular Developer

---

