CREATE TABLE veiculos
(
    id           BIGINT AUTO_INCREMENT PRIMARY KEY,
    marca        VARCHAR(255),
    modelo       VARCHAR(255),
    placa        VARCHAR(255),
    ano          INT,
    cor          VARCHAR(255),
    valor_diaria DECIMAL(10, 2)
);

INSERT INTO veiculos(marca, modelo, placa, ano, cor, valor_diaria)
VALUES ('Renault', 'Kwid', 'GBO6A52', 2024, 'Branco', 50.00),
('Fiat', 'Argo', 'ABC1D23', 2023, 'Prata', 80.00),
('Volkswagen', 'Gol', 'XYZ9K88', 2022, 'Preto', 70.00),
('Chevrolet', 'Onix', 'LMN4P56', 2023, 'Vermelho', 90.00),
('Hyundai', 'HB20', 'QWE7R89', 2024, 'Azul', 85.00);


CREATE TABLE pessoas
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome     VARCHAR(255),
    cpf      VARCHAR(255),
    telefone VARCHAR(255),
    email    VARCHAR(255)

);



INSERT INTO pessoas(nome, cpf, telefone, email)
VALUES ('Alex', '48454376859', '9593921260', 'Alex.souza12@live.com'),
('João Silva', '12345678901', '11999990001', 'joao@email.com'),
('Maria Souza', '98765432100', '11999990002', 'maria@email.com'),
('Carlos Lima', '45678912300', '11999990003', 'carlos@email.com'),
('Ana Oliveira', '78912345600', '11999990004', 'ana@email.com');


CREATE TABLE alugueis
(
    id          BIGINT AUTO_INCREMENT PRIMARY KEY,
    pessoa_id   BIGINT NOT NULL,
    veiculo_id  BIGINT NOT NULL,
    data_inicio  DATE,
    data_fim    DATE,
    valor_total DECIMAL(10, 2),
    FOREIGN KEY (pessoa_id) REFERENCES pessoas (id),
    FOREIGN KEY (veiculo_id) REFERENCES veiculos (id)

);



INSERT INTO alugueis(pessoa_id, veiculo_id, data_inicio, data_fim, valor_total)
VALUES (1, 1, '2026-3-25', '2026-4-1', 450.00),
(1, 1, '2026-03-01', '2026-03-05', 200.00),
(2, 2, '2026-03-10', '2026-03-12', 160.00),
(3, 3, '2026-03-15', '2026-03-18', 210.00),
(4, 4, '2026-03-20', '2026-03-25', 450.00),
(1, 5, '2026-03-22', '2026-03-24', 170.00);


