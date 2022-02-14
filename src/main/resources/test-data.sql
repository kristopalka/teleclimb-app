INSERT INTO COMPETITION (ID, NAME, DISCIPLINE, GENDER, CATEGORY_ID)
VALUES
    (1, 'Puchar Polski', 'LEAD', 'MALE', '4'),
    (2, 'Puchar Polski', 'LEAD', 'FEMALE', '4');


INSERT INTO PARTICIPANT (ID, NAME, LAST_NAME, START_NUMBER, CLUB_NAME, BIRTH_DATE, COMPETITION_ID)
VALUES
    (1, 'Krzysztof', 'Pałka', 2137, 'AZS AGH', '2000-08-26', 1),
    (2, 'Andrzej', 'Krzywda', 9706, 'AZS AGH', '2002-08-26', 1),
    (3, 'Mikołaj', 'Cheretyk', 9706, 'Korona Kraków', '2004-12-26', 1),
    (4, 'Kinga', 'Ociepka', 3452, 'Korona Kraków', '2007-08-26', 2),
    (5, 'Aleksandra', 'Kotwas', 2355, 'AZS AWF', '2010-08-26', 2),
    (6, 'Kinga', 'Pałka', 5442, 'Pałac młodzieży Tarnów', '2015-08-26', 2);

INSERT INTO ROUTE (ID, NAME, DESCRIPTION, DISCIPLINE)
VALUES
    (1, 'R1', 'Droga męska 8a czerwona', 'LEAD'),
    (2, 'R2', 'Droga żeńska 7b niebieska', 'LEAD');