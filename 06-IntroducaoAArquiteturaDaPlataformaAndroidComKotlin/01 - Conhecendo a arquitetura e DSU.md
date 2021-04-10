# Introdução a arquitetura da plataforma Android com Kotlin 1/3 (Jamille Ferreira)
> Conhecendo a arquitetura e DSU

## Diagrama da arquitetura

Objetivos:
- Visão geral do Android
- Diagrama da arquitetura de um software Android
- Componentes da plataforma Android

O Android é uma pilha de software com base em Linux e código aberto com criado para diversos dispositivos e fatores de forma.

[ Material Base - Arquitetura da Plataforma](https://developer.android.com/guide/platform?hl=pt-br) 

#### Kernel do Linux

A fundação da plataforma é o kernel do Linux. Com isso os níveis acima delegam para o kernel algumas funções como o **Android Runtime (ART)** que confia ao kernel funcionalidades como encadeamento e gerenciamento de memória de baixo nível.  

Outra grande vantagem é aproveitar os recursos de segurança principais do kernel do Linux além de que os fabricantes desenvolvam drivers de hardware para um kernal conhecido.

| Lixux Kernel | | |
|:-------------:|:-------------:|:-------------:|
| | **Drivers** | |
| Audio |  Binder (IPC) | Display |
| keypad | Bluetooth | Camera |
| Shared Memory | USB | WIFI |
| | **Power Management** | |

#### Camada de Abstração de hardware (HAL)

Esta camada fornece interfaces padrão que expõem as capacidades de hardware do dispositivo para a estrutura da Java API de maior nível.  

A HAL consiste em módulos de biblioteca, que implementam uma interface para um tipo específico de componente de hardware, como o módulo de câmera ou Bluetooth.  

| HAL | | | | |
|-|-|-|-|-|
| Audio | Bluetooth | Camera | Sensors | ... |

#### Android Runtime (ART) | Bibliotecas C/C++ nativas

Acima da camada de abstração existe uma divisão entre os componentes que permite a execução de aplicativos e serviços do sistema (**Runtime**) e as bibliotecas nativas (**C** / **C++**).  

O **ART** é projetado para executar várias máquinas virtuais em dispositivos de baixa memória executando arquivos DEX, um formato de bytecode projetado especialmente para Android, otimizado para oferecer consumo mínimo de memória. Alguns dos recursos principais do ART são:

- Compilação "ahead-of-time" (AOT) e "just-in-time" (JIT)
- Coleta de lixo (GC) otimizada
- Conversão dos arquivos de formato Dalvik Executable (DEX) para um código de máuqina mais compacto.
- Melhor suporte para depuração, relatório detalhado de exceções e erros.  

Vários componentes e serviços principais do sistema Android, como ART e HAL, são implementados por código nativo que exige **bibliotecas nativas** programadas em **C** e **C++**. A plataforma Android fornece as Java Framework APIs para expor a funcionalidade de algumas dessas bibliotecas nativas aos aplicativos. Se estiver desenvolvendo um aplicativo que exige código C ou C++, você pode usar o Android NDK.

| Native C/C++ Libraries | | | | Android Runtimes |
|-|-|-|-|-|
| Webkit | OpenMax AL | Libc | | Android Runtime(ART) |
| Media Framework | OpenGL ES | ... | | Core Libraries |

#### Java API Framework

O conjunto completo de recursos do SO Android está disponível pelas APIs programadas na linguagem Java. Essas APIs formam os blocos de programação que você precisa para criar os aplicativos Android simplificando a reutilização de componentes e serviços de sistema modulares e principais, inclusive:

- Um sistema de visualização
- Um gerenciador de recursos
- Um gerenciador de noticação
- Um gerenciador de atividade
- Provedor de conteúdo

É importante ter conhecimento da versão da API em vista que algumas funcionalidades não estão disponíveis em todas as versões e nem todos os aparelhos suportam todas as versões do API. Dessa forma os desenvolvedores devem se atentar para as características do seu aplicativo e dos seus usuários.

| Java API Framework| | | | |
|-|-|-|-|-|
| | Managers | | | |
| Content Providers | Activity | Location | Package | Notification |
| View System | Resource | Telephony | Window | |

#### Aplicativos do sistema
Nessa camada têm-se um conjunto de aplicativos principais que já vem com o Android, que podem ser utilizados pelos desenvolvedores como funções de suas aplicações. Dentre os aplicativos de sistemas encontramos: e-mail, SMS, calendários, navegador de internet contatos etc. 
Vale salientar que os aplicativos inclusos não têm status especial sobre os aplicativos terceirizados (instalados pelo usuário) o qual podem substituir os aplicativos do sistema, salvo algumas excesões como exemplo o aplicativo de configurações.  

| System Apps | | | | |
|-|-|-|-|-|
| Dialer | Email | Calendar | Camera | ... |

## Atualizações dinâmicas do sistema DSU

Objetivos:
- O que é Atualizações dinâmicas do sistema (DSU)
- Imagem genérica do sistema (GSI)
- Requisitos das DSUs

[ Material base - DSU ](https://developer.android.com/topic/dsu?hl=pt-br)
[ Material base - GSI ](https://developer.android.com/topic/generic-system-image?hl=pt-br)

As **Atualizações dinâmicas do sistema** (DSU, na sigla em inglês) são um recurso do sistema lançado no Android 10 que faz o seguinte:

- Faz o download de uma nova **imagem genérica do sistema** (GSI), ou outra imagem do sistema Android, para seu dispositivo.
- Cria uma nova partição dinâmica.
- Carrega o GSI para a nova partição.
- Inicializa a GSI como um SO convidado no dispositivo.

As DSUs também permitem alternar facilmente entre a imagem do sistema atual e a GSI para que você possa testá-la sem correr o risco de corromper a imagem do sistema atual.

#### Imagem genérica do sistema GSI

Uma imagem genérica do sistema (GSI) é uma implementação de Android puro com código do Android Open Source Project (AOSP) não modificado e pode ser executada em vários dispositivos Android. Estão disponíveis para desenvolvedores de apps em todo o ciclo de versões do Android. Você, como desenvolvedor de apps, pode instalar e executar as GSIs Android mais recentes em vários dispositivos Android e em vários estágios de versão do SO Android, incluindo as fases de pré-visualização e Beta, para testar apps.

#### Requisitos das DSUs

As DSUs dependem do recurso de partição dinâmica do Android, e que as GSIs sejam assinadas pelo Google ou pelos seus OEMs como uma imagem de sistema confiável.