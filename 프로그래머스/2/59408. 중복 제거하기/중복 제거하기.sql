-- 코드를 입력하세요
SELECT COUNT (DISTINCT NAME)  -- count 갯수 조회 distinct: 중복은 하나로
FROM ANIMAL_INS
WHERE NAME IS NOT NULL -- 이름이 NULL인 경우는 집계하지 않음