CREATE TABLE db_users {
    id INT serial,
    descricao varchar(100) UNIQUE NOT NULL,
    sigla varchar(100) NOT NULL
};