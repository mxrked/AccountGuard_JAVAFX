USE [AccountGuard_JAVAFX]
GO
/****** Object:  Table [dbo].[Accounts]    Script Date: 5/15/2023 7:09:19 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Accounts](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[AccountType] [varchar](max) NULL,
	[AccountEmail] [varchar](max) NULL,
	[AccountPassword] [varchar](max) NULL,
 CONSTRAINT [PK_Accounts] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
