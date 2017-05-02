CREATE TABLE public.BOOK
(
  ID SERIAL PRIMARY KEY,
  TITLE TEXT
);

INSERT INTO public.book (title) VALUES ('qwer');

-- INSERT INTO BOOK(ID, TITLE, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE,
-- PRICE) values (1001, 'Изучаем Java EE 7', 'Нет, это лучшая',
-- 1, '5678-9012', 550, 53)
-- INSERT INTO BOOK(ID, TITLE, DESCRIPTION, ILLUSTRATIONS, ISBN, NBOFPAGE,
-- PRICE) values (1010, 'Властелин колец', 'Одно кольцо
-- для управления всеми остальными', 0, '9012-3456', 222, 23)