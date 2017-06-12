USE adlister_db;

INSERT INTO adlister_db.users (id, username, email, password)
VALUES ('0001', 'derek', 'derekwfrye@gmail.com', "password");

INSERT INTO adlister_db.ads (id, user_id, title, description)
    VALUES ('0001', '0001', 'coffee', 'We have the best coffee folks');