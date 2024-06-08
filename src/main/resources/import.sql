INSERT INTO users (nickname, user_comment, email, password, created_date, category)
VALUES ('김혜승', 'rlagPtmd', 'rlagPtmd@e-mirim.hs.kr', 'rlagPtmd1!', '2023-10-20 10:11:20', 1)
ON DUPLICATE KEY UPDATE
    nickname = VALUES(nickname),
    user_comment = VALUES(user_comment),
    password = VALUES(password),
    created_date = VALUES(created_date),
    category = VALUES(category);

INSERT INTO users (nickname, user_comment, email, password, created_date, category)
VALUES ('이진선', 'dlwlstjs', 'dlwlstjs@e-mirim.hs.kr', 'dlwlstjs1!', '2023-10-20 10:11:20', 1)
ON DUPLICATE KEY UPDATE
    nickname = VALUES(nickname),
    user_comment = VALUES(user_comment),
    password = VALUES(password),
    created_date = VALUES(created_date),
    category = VALUES(category);

INSERT INTO users (nickname, user_comment, email, password, created_date, category)
VALUES ('이지인', 'dlwlsdls', 'dlwldls@e-mirim.hs.kr', 'dlwlsdls1!', '2023-10-20 10:11:20', 1)
ON DUPLICATE KEY UPDATE
    nickname = VALUES(nickname),
    user_comment = VALUES(user_comment),
    password = VALUES(password),
    created_date = VALUES(created_date),
    category = VALUES(category);

INSERT INTO post (email) VALUE ('rlagPtmd@e-mirim.hs.kr')
ON DUPLICATE KEY UPDATE
    email = VALUES(email);

INSERT INTO post (email) VALUE ('dlwldls@e-mirim.hs.kr')
ON DUPLICATE KEY UPDATE
    email = VALUES(email);
