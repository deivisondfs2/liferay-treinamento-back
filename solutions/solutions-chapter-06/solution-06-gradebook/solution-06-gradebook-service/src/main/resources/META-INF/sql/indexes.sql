create index IX_9BA4C9BE on GradeBook_Assignment (groupId, status);
create index IX_60BB52F8 on GradeBook_Assignment (status);
create index IX_76C32786 on GradeBook_Assignment (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_37DBD788 on GradeBook_Assignment (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_48679F5 on GradeBook_Submission (groupId, assignmentId);
create index IX_839FA775 on GradeBook_Submission (studentId);

create index IX_14D546B8 on Gradebook_Assignment (groupId);
create index IX_B5847C92 on Gradebook_Assignment (status, groupId);
create index IX_51DB1FA6 on Gradebook_Assignment (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F2D357A8 on Gradebook_Assignment (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_E84495D5 on Gradebook_Submission (groupId, assignmentId);
create index IX_A7930351 on Gradebook_Submission (studentId, assignmentId);