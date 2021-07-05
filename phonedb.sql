--테이블 삭제

drop table phone;

--시퀀스 삭제
drop sequence seq_person_id;

--테이블 생성

create table phone(
     person_id   number(10),
    name varchar2(100) not null,
    hp varchar2(500),
    company varchar2(500),
    PRIMARY key (person_id)
    );

    
-- 시퀀스 생성    
CREATE SEQUENCE seq_person_id
INCREMENT BY 1 
START WITH 1
nocache;

--insert (등록)
insert into phone values(seq_person_id.nextval, '이효리', '010-1111-1111', '02-1111-1111');
insert into phone values(seq_person_id.nextval, '정우성', '010-2222-2222', '02-2222-2222');
insert into phone values(seq_person_id.nextval, '유재석', '010-3333-3333', '02-3333-3333');
insert into phone values(seq_person_id.nextval, '이정재', '010-4444-4444', '02-4444-4444');
insert into phone values(seq_person_id.nextval, '서장훈', '010-5555-5555', '02-5555-5555');



--select (출력) 
select person_id,
    name,
    hp,
    company
from phone;


--update (수정)
update phone
set name = '나루토',
    hp = '010-3157-6119',
    company = '010-2222-2222'
where person_id = 3;

--delete (삭제)
DELETE from phone
where person_id =  2;


rollback;

commit;



select person_id,
       name,
       hp,
       company
from phone
where name like '%석%'