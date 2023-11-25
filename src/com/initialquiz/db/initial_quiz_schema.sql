CREATE TABLE user (
    username VARCHAR(255) PRIMARY KEY,
    passwd VARCHAR(255) NOT NULL,
    point INT NOT NULL
);

CREATE TABLE quiz (
    initial_word VARCHAR(30) PRIMARY KEY NOT NULL,
    answer VARCHAR(50) NOT NULL,
    explanation TEXT NOT NULL
);

