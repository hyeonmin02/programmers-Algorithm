-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE ANIMAL_TYPE = 'dog'
AND NAME LIKE '%EL%' ## EL이 앞 뒤 어디든 포함되어있는 이름을 찾아와라
ORDER BY NAME
