-- 코드를 입력하세요

SELECT NAME 
-- NAME 칼럼을 뽑아줌
FROM (
    SELECT NAME
    FROM ANIMAL_INS
    ORDER BY DATETIME
    )
-- 테이블 안의 NAME의 DATETIME을 순서대로 배열
WHERE ROWNUM = 1
-- rownum = 1은 결과 집합에서 첫 번째 행을 선택하기 위해 사용되는 조건