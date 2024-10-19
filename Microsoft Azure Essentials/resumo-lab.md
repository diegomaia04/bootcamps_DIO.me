- Detalhes importantes, informações pertinentes e entre outras anotações

- [x]  Introdução ao Ambiente Cloud
- [x] Conceitos iniciais de Cloud com Azure
- [ ] Arquitetura e serviços Azure
- [ ] Gerenciamento e governança na Azure


Conceitos iniciais de Cloud com Azure 


Microsoft Azure - Localizando Serviços Por Categoria


	Tutorial e explicação do Portal do Microsoft Azure, área de trabalho e todos os seus serviços fornecidos.
	
	Diversos tipos de serviços para utilizar, muito alto explicativo os recursos. Verificar depois
	
	revisão de todos os tipos de serviços que a microsoft disponibiliza
	

Benefícios da Computação em Nuvem

Benefícios da Nuvem

- Quais são eles? Como podem ser aplicados? Como podem ser utilizados no dia a dia?
	- Descrever os benefícios da alta disponibilidade e da escabalidade na nuvem
		- A alta disponibilidade se concentra em garantir a disponíveis máxima, independentemente de interrupções ou eventos que possam ocorrer
		- A escalabilidade refere-se à capacidade de ajustar recursos para atender à demanda
		- A capacidade de escalar significa que você poderá adicionar mais recurso
		- Com a escala vertical, se você estivesse desenvolvendo um aplicativo e precisasse de mais capacidade de processamento, poderia escalar verticalmente para adicionar mais CPUs ou RAM
		- Você poderá adicionar maquinas virtuais ou contêineres por meio da expansãoDescrever os benefícios da confiabilidade e da previsibilidade da nuvem
		- A nuvem oferece ferramentas de segurança, que atendem as necessidades dos clientes, mas é importante lembrar que a implementação de muitas delas devem ser realizadas pelo cliente 
		- a infraestrutura como serviço fornecerá recurso físicos, mas permitirá que você gerencie os sistemas operacionais e o software instalado, incluindo aplicação de patches e manutenção 
	- Descrever os benéficos da segurança e da governança na nuvem
		- A auditoria baseada em nuvem ajuda a sinalizar qualquer recurso que esteja fora de conformidade com seus padrões corporativos e fornece estratégicas de resolução de problemas 
	- E sua capacidade de gerenciamento
		- um dos principais benefícios da computação em nuvem são as opções de capacidade de gerenciamento. Há dois tipos de gerenciamento para computação em nuvem que você aprendera nesta serie e ambos trazem excelentes benéficos 
		- Escalar automaticamente a implantação de recursos com base de necessidade 
	

Criando maquinas virtuais na Azure

	
	O que significa SLA: " Service Level Agreement" Trata-se de um contrato que estabelece os direitos e as obrigações entre contratado e contratante, visando alinhas expectavas e garantir o cumprimento da qualidade 

IaaS, PaaS e SaaS na Azure

	
	- Descrever a Iaas ( infraestrutura como serviço )
		- IaaS é um modelo de computação em nuvem que fornece acesso sob demanda a recurso de computação, como servidores, armazenamento, rede e virtualização. Em vez de comprar e gerenciar seus próprios equipamentos físicos, as empresas podem alugar esses recursos de um provedor IaaS, como google clound, AWS, etc.
	- Descrever a Paas ( plataforma como serviço).
		- Paas é um modelo de computação em nuvem que fornece aos desenvolvedores uma plataforma para construir, implantar e gerenciar aplicativos sem se preocupar com a infraestrutura subjacente
	- Descrever Software como Serviço ( SaaS )
		- é um modelo de distribuição de software onde o provedor hospeda aplicativos e os disponibiliza aos clientes pela internet. Em vez de instalar e manter o software em seus próprios computadores, os clientes  acessam o aplicativo por meio de um navegador web ou AP
	- Identificar os casos de usos apropriados para cada serviço de nuvem 

		- IAAS: O serviço de nuvem mais flexível, você configura e gerencia o hardware para seu aplicativo
		- PAAS: Focado no desenvolvimento de aplicativos, O gerenciamento de plataforma e realizado pela nuvem, modelo de preço  de pagamento conforme o usos
		- SAAS? Modelo de preco de pagamento conforme o uso, os usuarios pagam pelo sofware que utilizam em um modelo de assinatura
	

Tipos de serviços de Nuvem


Configurando uma instancia de Banco de Dados na Azure

---

Arquitetura e serviços Azure


Microsoft Azure - Localizando Serviços Por Categoria

Roteiro de aprendizagem
	- Regiões e zonas de disponibilidade
	- Assinaturas e grupos de recursos

Componentes de Arquitetura do Azure
	- Descrever regiões, pares de regiões de recursos do Azure
		- As regiões são compostas de um ou mias datacenters muitos próximos
		- Eles fornecem flexibilidade e escala para reduzir a latência do cliente
		-  as regiões preservam a residência dos dados uma oferta abrangente de conformidade 
		- cada datacenter é equipado com alimentação, resfriamento e rede independentes 
		  
	- Grupos de recursos
		- Um grupo de recurso é um contêiner que você usa para gerenciar e agregar recursos em uma única unidade 
		- os recursos eles podem exigir em apenas um grupo de recursos
		  
	- Descrever as assinaturas
		- Limite de Cobrança: gere relatório de cobrança e faturas separados para cada assinatura
		- Limite do controle de acesso: gerenciar e controlar o acesso aos recursos que os usuários podem provisionar com assinaturas específicas 
		  
	- Descrever os grupos de gerenciamento
	- Descrever a hierarquia de grupos de recursos, assinaturas e grupos de gerenciamento

Serviços de computação e máquinas virtuais do Azure

	- tipos de computação
		- comparar tipo de computação, incluindo instancias de contêiner, maquinas virtuais e funções
		- descrever os recursos exigidos para maquinas virtuais
		- definir pontos de extremidade públicos e privados 
		- descrever maquinas virtuais 
		     
	- hospedagem de aplicativos
		- A área de de trabalho virtual do Azure é uma virtualização da área de trabalho e aplicativo executada na nuvem
			- Cria um ambiente completo de virtualização da área de trabalho sem precisar executar outros servidores de gateway
			- reduza o risco de que o recursos seja deixado para trás
			- implantação reais de varias sessões 
			  
	- Azure Functions:
		- uma oferta de PaaS que dá suporte a operações de computação sem servidor 
		- O código baseado em eventos é executado quando chamado, sem exigir uma infraestrutura de servidor durante períodos inativos 
		  
	- Maquinas virtuais
		- Servidor baseado em nuvem que dá suporte a ambientes Windows ou Linux
		- Útil para migrações para a nuvem
		- Pacote do sistema operacional completo

- Armazenamento, Serviços de armazenamento, opções de redundância 
	- Comparar  os serviços de armazenamento do Azure
	- Descrever as camadas de armazenamento
	-  Descrever as opções de conta de armazenamento e os tipos de armazenamento
	- Identificar opções para mover arquivos, incluindo o Azcopy, o gerenciador de armazenamento do Azure e a sincronização de arquivos Azure
	- redes virtuais
---

Introdução ao Ambiente Cloud


introdução ao azure essentials com a Microsoft 7


Free tier -> faixa gratuita de serviços para aprendizagem.

Visão Geral sobre o bootcamp e suas etapas

lembrar de postar no linkedin o certificado desse curso e atualizar o notion.

Apresentação geral do curso.


introdução a computação em nuvem


AZ - 900: introdução aos conceitos básicos do Microsoft Azure 
-  curso focado em cloud computing, com suas definições, significados, etc. 

Objetivo geral:
Este curso fornece um nível de conhecimento básico sobre:
	- Conceitos do Azure
	- Principais serviços do Azure
	- Principais soluções e ferramentas de gerenciamento segurança geral e segurança de rede 
	- Governança, privacidade e recursos de conformidade e gerenciamento de custos do Azure 

Pré-requisitos:
	- Conhecimentos em informática básica
	- Ter familiaridade com a computação em nuvem é útil, mas não é necessário 

Roteiro de Aprendizagem:
	- o que é computação em nuvem
	- responsabilidade compartilhada
	- modelos de nuvem
	- custo de capital versus custo operacional
	- definir computação em nuvem
	- definir modelos de nuvem, incluindo publico privado e hibrido
	- identificar os casos de uso apropriados para modelo de nuvem

A computação em nuvem é o fornecimento de serviços de computação pela internet, habilitando inovações mais rápidas, recursos flexíveis e economias de escala

Existem quatro modelos de nuvem:

Nuvem Privada:
	- as organizações criam um ambiente em nuvem em seu datacenter
	- as organizações são responsáveis por operar os serviços que fornecem
	- não fornece acesso aos usuários fora da organização  
	- as organizações tem controle total sobre os recursos e a segurança

Nuvem Publica: 
	- Pertencente a serviços de nuvem ou provedor de hosting
	- Os aplicativos podem ser provisionados e desprovisionados  rapidamente
	- fornece recursos e serviços a varias organizações e usuários
	- acessada via conexão de rede segura
	- as organizações pagam apenas pelo que utilizam 

Nuvem híbrida:
	- combina nuvens publicas e privadas para permitir que os aplicativos sejam executados no local mais adequado 
	- as organizações determinam onde executar seus aplicativos
	- as organizações controlam a segurança, a conformidade e os requisitos legais
	- fornece a maior flexibilidade

Despesas de capital (CapEx)
- O gasto inicial em infraestrutura física
- As despesas do CapEx tem um valor que se reduz com o tempo 

Despesas Operacionais
- Gastar com os produtos e serviços conforme necessário, pagamento conforme o uso

MODELO BASEADO EM CONSUMO
Os provedores de serviços em nuvem operam em um modelo baseado no consumo, o que significa que os usuários finais pagam somente pelo recurso que usaram.


Versionamento de Código com Git e GitHub


Percurso do Curso:
 
1. Visão Geral do Curso e Ferramentas
2. Instalação, Configuração e Autenticação
3. Primeiro passos com Git e Github

O que é versionamento de código: 

cada atualização do progresso do código cria uma nova versão do código, em um possível projeto grande, isso pode trazer complicações em organização e manutenção do código

Sistemas de controle de versão

Controlam as versões de um arquivo ao longo tempo, isso é, registra o histórico de atualizações de um arquivo, gerencia quais foram as alterações e gerencia também sua segurança

o que é GIT:

Sistema de Controle de Versão Distribuído.
Gratuito e Open Source ( Código aberto
Ramificações ( branching ) e fusões ( merging ) eficientes

Pagina oficial do Git ( Documentação Importante )  : DOCUMENTAÇÃO GIT

No Terminal do GIT bash, em qualquer pasta, os comandos a seguir serão uteis

```
git config ( permite a gente visualizar e definir as variáveis de configuração do GIT)
git config --global user.name " nome do repositorio "
git config --global user.email " email "
git config user.name
git config user.email
git config init.defaultBrach ( retorna a brach padrao q esta configurada )
git config init.defaultBrach main (define nova brach padrao)
git config --global --list ( retorna todas as configurações globais )
```

Criando e Clonado Repositórios:
Existem duas formas de obter um repositório Git na sua maquina:
1. Transformando um diretório local que não esta sob controle de versão, em um repositório Git
2. Clonado um repositório Git existente

```
mkdir ( comando basico do terminal, para criar um diretorio )
cd ' nome do diretorio' ( entrar no direotirio criado )
git init ( trasnfomando em um repositorio git )
git clone ' url do repositrio que queira copiar' "nome do novo repositorio" ( esse repositorio sera criado no diretorio clonado acima )
git clone URL --branch ' nome da breach ' --single-branch ( copiar apenas uma brech de um repositrio inteiro )
git status ( mostrar os status da arvore de trabalho, stage area )
touch README.md ( criar um README vazio no repositorio, md = 'markdown' 
git add 'noem do arquivo' ( comando sera possivel apos quando estiver algo adicionado com git add na fila )
git commit -m'mensagem do commit' ( ultimo passo para adicionar um arquivo em um repositorio )
echo resumos/ > .gitignore ( para o git ignorar essa pasta do git ignore)
touch aulas/.gitkeep ( usado para fazer o git reconhecer um direoreio, mesmo que ele esteja vazio )
git add. ( faz que todos os arquivos em fila estejam prontos para ser commitados )
rm - rf .git ( removendo uma pasta git de um git init em um diretorio indejesado )
git restore ' nome do arquivo' ( retorna para o ultimo status que foi salvo os arquivos)
git commit --amend -m'mensagem do commit' ( altera a mensagem do ultimo commit )
git reset --soft 'hash do commit' ( pega os arquivos apos o commit indicado e traz para a area de preparação )
git reflog ( historico mais detalhado das mudançãs e codigos feitos )
```

- untracked files ( arquivos que o git não reconhece, não estavam em nenhum commit anterior )

Trabalhando com Brach
     De maneira simplista, uma Brach é uma ramificação do seu projeto
	- é um ponteiro móvel para um commit no histórico do repositório 
	- você pode criar uma brach dentro de uma brach.

```
echo "#commit-1-brach-main" > commit-1-brach-main.txt
git checkout -b teste ( esse comando trocara a brach atual para a brach 'teste', essa nova brach tera os mesmo commits que a trocada )
git branch -v ( mostra os ultmimos commits feitos em cada branch )
git merge teste ( enquanto voce estiver na main, digite isso para trazer as mudancas feitas na branch teste para a main )
git branch ( mostra todos as branch )
git branch -d teste ( remover uma branch )
```
