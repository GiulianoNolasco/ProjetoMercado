# ProjetoMercado


# Estrutura da tabela `clientes`


CREATE TABLE `clientes` (
  `id_cliente` int(100) NOT NULL,
  `nome_cliente` varchar(255) NOT NULL,
  `idade_cliente` int(100) NOT NULL,
  `situacao_cliente` char(1) NOT NULL DEFAULT 'A'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

# Estrutura da tabela `funcionarios`


CREATE TABLE `funcionarios` (
  `id_funcionario` int(10) NOT NULL,
  `nome_funcionario` varchar(255) NOT NULL,
  `idade` int(10) NOT NULL,
  `situacao` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


# Estrutura da tabela `produtos`


CREATE TABLE `produtos` (
  `id_produto` int(10) NOT NULL,
  `descricao_produto` varchar(255) NOT NULL,
  `preco` float NOT NULL,
  `situacao` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


# Estrutura da tabela `vendas`


CREATE TABLE `vendas` (
  `id_venda` int(10) NOT NULL,
  `fk_cliente` int(10) NOT NULL,
  `fk_produto` int(10) NOT NULL,
  `fk_funcionario` int(10) NOT NULL,
  `quantidade` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


# Índices para tabelas despejadas



# Índices para tabela `clientes`

ALTER TABLE `clientes`
  ADD PRIMARY KEY (`id_cliente`);


# Índices para tabela `funcionarios`

ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`id_funcionario`);


# Índices para tabela `produtos`

ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id_produto`);


# Índices para tabela `vendas`

ALTER TABLE `vendas`
  ADD PRIMARY KEY (`id_venda`),
  ADD KEY `fk_cli` (`fk_cliente`),
  ADD KEY `fk_prod` (`fk_produto`),
  ADD KEY `fk_fun` (`fk_funcionario`);


# AUTO_INCREMENT de tabelas despejadas



# AUTO_INCREMENT de tabela `clientes`

ALTER TABLE `clientes`
  MODIFY `id_cliente` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;


# AUTO_INCREMENT de tabela `funcionarios`

ALTER TABLE `funcionarios`
  MODIFY `id_funcionario` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;


# AUTO_INCREMENT de tabela `produtos`

ALTER TABLE `produtos`
  MODIFY `id_produto` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;


# AUTO_INCREMENT de tabela `vendas`

ALTER TABLE `vendas`
  MODIFY `id_venda` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;


# Restrições para despejos de tabelas



# Limitadores para a tabela `vendas`

ALTER TABLE `vendas`
  ADD CONSTRAINT `fk_cli` FOREIGN KEY (`fk_cliente`) REFERENCES `clientes` (`id_cliente`),
  ADD CONSTRAINT `fk_fun` FOREIGN KEY (`fk_funcionario`) REFERENCES `funcionarios` (`id_funcionario`),
  ADD CONSTRAINT `fk_prod` FOREIGN KEY (`fk_produto`) REFERENCES `produtos` (`id_produto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

 
