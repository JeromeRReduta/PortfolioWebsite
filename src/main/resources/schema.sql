CREATE TABLE PROJECT(
  ID BIGSERIAL PRIMARY KEY,
  NAME VARCHAR(64) NOT NULL,
  GITHUB VARCHAR(256) NOT NULL,
  SKILLS_USED VARCHAR(1024) NOT NULL,
  SUMMARY VARCHAR(2048)
);

