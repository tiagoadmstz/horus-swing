CREATE TABLE Atividade (
    ID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    VERSAO VARCHAR(50) NULL,
    DATA_INI DATE NULL,
    DATA_FIM DATE NULL,
    HORA_INI TIME NULL,
    HORA_FIM TIME NULL,
    MATRIZEIRO VARCHAR(100) NULL,
    TURNO VARCHAR(5) NULL,
    OCORRENCIA VARCHAR(100) NULL,
    LOCAL VARCHAR(100) NULL,
    OBSERVACAO VARCHAR(450) NULL,
    ID_PERFIL_ID INT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
