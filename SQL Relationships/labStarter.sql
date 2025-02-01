-- Create Students table if it does not exist
CREATE TABLE IF NOT EXISTS Students (
    StudentID INT PRIMARY KEY,
    StudentName VARCHAR(255),
    Age INT,
    Grade CHAR(1)
);

-- Insert sample data into Students table
INSERT INTO Students (StudentID, StudentName, Age, Grade) VALUES
    (1, 'Alice', 14, 'A'),
    (2, 'Bob', 15, 'B'),
    (3, 'Charlie', 14, 'A'),
    (4, 'David', 16, 'C')
ON DUPLICATE KEY UPDATE
    StudentName = VALUES(StudentName),
    Age = VALUES(Age),
    Grade = VALUES(Grade);

-- Create FavoriteFoods table if it does not exist
CREATE TABLE IF NOT EXISTS FavoriteFoods (
    FoodID INT PRIMARY KEY,
    StudentID INT,
    FoodName VARCHAR(255),
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);

-- Insert sample data into FavoriteFoods table
INSERT INTO FavoriteFoods (FoodID, StudentID, FoodName) VALUES
    (1, 1, 'Pizza'),
    (2, 2, 'Burger'),
    (3, 2, 'Pasta'),
    (4, 4, 'Sushi')
ON DUPLICATE KEY UPDATE
    StudentID = VALUES(StudentID),
    FoodName = VALUES(FoodName);
