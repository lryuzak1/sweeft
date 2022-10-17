use sweeft
go
create table Teacher(
teacher_ID int not null identity(1,1) primary key,
first_name nvarchar(25),
last_name nvarchar(25),
gender nvarchar(25),
subject nvarchar(25),
)

go
create table Pupil(
pupil_ID int not null identity(1,1) primary key,
first_name nvarchar(25),
last_name nvarchar(25),
gender nvarchar(25),
class nvarchar(25),
)

go
create table Teacher_Pupil(
teacher_ID int not null references Teacher(teacher_ID),
pupil_ID int not null references Pupil(pupil_ID),
primary key(teacher_ID,pupil_ID)
)


select * from Teacher t
inner join Teacher_Pupil tp on t.teacher_ID=tp.teacher_ID
inner join Pupil p on tp.pupil_ID=p.pupil_ID where p.first_name like N'გიორგი'
