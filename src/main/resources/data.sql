DROP TABLE IF EXISTS expenses;

CREATE TABLE expenses (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          amount DECIMAL(10, 2) NOT NULL,
                          category VARCHAR(255) NOT NULL,
                          date DATE NOT NULL,
                          description VARCHAR(255)
);

INSERT INTO expenses (name, amount, category, date, description)
VALUES ('Groceries', 50.00, 'Food', CAST('2025-02-20' AS DATE), 'Weekly shopping');

INSERT INTO expenses (name, amount, category, date, description)
VALUES ('Uber Ride', 15.75, 'Transport', CAST('2025-02-21' AS DATE), 'Ride to work');

INSERT INTO expenses (name, amount, category, date, description)
VALUES ('Gym Membership', 40.00, 'Fitness', CAST('2025-02-19' AS DATE), 'Monthly gym fee');

INSERT INTO expenses (name, amount, category, date, description)
VALUES ('Movie Ticket', 12.00, 'Entertainment', CAST('2025-02-18' AS DATE), 'Saw a new movie');

INSERT INTO expenses (name, amount, category, date, description)
VALUES ('Lunch', 12.50, 'Food', CAST('2025-02-21' AS DATE), 'Lunch with friends');