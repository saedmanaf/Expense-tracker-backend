![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?style=for-the-badge&logo=postgresql&logoColor=white)
![Open Source](https://img.shields.io/badge/Open%20Source-💡-green)
![Contributions Welcome](https://img.shields.io/badge/Contributions-Welcome-brightgreen.svg?style=for-the-badge)



💰 Expense Tracker – Full-Stack App (Spring Boot + React)
A simple, no-nonsense expense tracker that started as a RESTful API and is now evolving into a full-stack project.
This is my hands-on way of solidifying CRUD, database management, and frontend integration skills.

🎯 Why This Project?
I’m four months into my Java course, and this project is my trial-by-fire to:

 Master Spring Boot and RESTful API development
 Implement full CRUD functionality for expenses
 Work with relational databases (H2 for now, PostgreSQL later)
 Break things, fix them, and (hopefully) learn before breaking them again
 Build a functional frontend to visualize & manage expenses

📢 Endpoints are working! As promised, repo is NOW PUBLIC!

Also, let’s be real—I’m milking my free IntelliJ Ultimate while I can. Once that student license expires… it’s hello, open-source editors!

🏆 End goal? A solid portfolio → internship → job (or world domination, we’ll see).

🛠️ Tech Stack

Backend:
 Java + Spring Boot
 H2 Database (PostgreSQL later)
 Spring Data JPA
 Swagger UI 
 OCR Processing (for Receipt Scanning!)
     Google Cloud Vision API or Tesseract OCR 
     Spring Boot file upload handling

Frontend:
 React + Vite
 Axios (API Requests)
 TailwindCSS (Styling)
 File Upload & Image Processing (for receipts)
     Image preview before upload
     Handle OCR results & autofill form

Tools & IDE:
 Swagger UI 
 IntelliJ Ultimate (until I’m forced back to VS Code 😭)
 GitHub Actions 

✅ Already Working 
 CRUD Operations – Add, edit, delete, and retrieve expenses
 Swagger UI – Auto-generated API documentation & testing
 H2 Console – Debugging directly in the browser

🚧 In Progress 
 Expense List UI – Fetch & display all expenses
 Add Expenses – A simple form to add expenses
 Edit & Delete Expenses – Manage expenses with UI actions
 Basic Data Visualization – Pie charts for spending categories
 Scan Receipt & Auto-Fill Form  

❌ Not Doing Authentication (Not needed for now, focusing on core functionality)

⚡ API Endpoints Overview
Method	Endpoint	Description
GET	/api/expenses	Fetch all expenses
GET	/api/expenses/{id}	Get an expense by ID
POST	/api/expenses	Add a new expense
PUT	/api/expenses/{id}	Update an existing expense
DELETE	/api/expenses/{id}	Remove an expense

🚀 Next Steps
 Fix any broken endpoints & validate inputs properly
 Set up React + Vite frontend 
 Create a UI to list, add & delete expenses
 Deploy (without breaking the entire thing 🤞)

💡 Lessons Learned So Far
 Spring Boot is magic… until you debug for hours.
 H2 is great for testing but would implode in production.
 Writing clean endpoints is easy—handling edge cases is a nightmare.
 Swagger saves time (and possibly my sanity).


🌟 Contributions & Feedback

This project is NOW PUBLIC, and contributions are welcome! 

⭐ Stars, forks, and issues are encouraged!

💡 Open to ideas for features & improvements!

📬 Contact: [elisemarieveskioja@gmail.com]


😂 Final Thoughts
If you’re still here, you’re either:

 Actually interested in my project (which means you have excellent taste, obviously).
 A recruiter scanning for red flags (I assure you, my exception handling is better than my life choices).
 Lost, confused, but too deep in now to back out (we ride at dawn).

Either way—glad to have you! 🚀 Stick around, watch me build cool stuff, and if this breaks in production… well, let’s just call that an immersive learning experience. 😎

And if nothing else, at least you can say you witnessed whatever this is unfold in real time. Exciting, right? Right??
