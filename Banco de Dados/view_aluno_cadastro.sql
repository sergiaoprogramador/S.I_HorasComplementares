CREATE 
    ALGORITHM = UNDEFINED 
    DEFINER = `root`@`localhost` 
    SQL SECURITY DEFINER
VIEW `view_aluno_cadastro` AS
    SELECT 
        `aluno`.`id_aluno` AS `id_aluno`,
        `aluno`.`matricula` AS `matricula`,
        `aluno`.`cadastro_id` AS `cadastro_id`,
        `cadastro`.`id_cadastro` AS `id_cadastro`,
        `cadastro`.`nome` AS `nome`,
        `cadastro`.`cpf` AS `cpf`,
        `cadastro`.`email` AS `email`,
        `cadastro`.`senha` AS `senha`,
        `cadastro`.`data_nascimento` AS `data_nascimento`,
        `cadastro`.`campus` AS `campus`,
        `cadastro`.`curso` AS `curso`
    FROM
        (`aluno`
        JOIN `cadastro` ON ((`aluno`.`cadastro_id` = `cadastro`.`id_cadastro`)))