INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(1, 'X-Bacon', 'https://lh3.googleusercontent.com/pw/ACtC-3e3jZt4fijF36CqOeBHBU3ksjqb4JZd0qCtdAEhG1v-4oZ_5ia54rph7iI6SqAhMSYRCevmcvrATKKRQ-Um51bfgzLWwWd4wNizo8p24vUVrBzFNiEXfyJfaxMGSiBBYGqUG1kaH9docJ_m6FYR_Mgy=w381-h310-no?authuser=0');
INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(2, 'X-Burger','https://lh3.googleusercontent.com/pw/ACtC-3e4SR2bqIAvHxBBUyPy3Jdx8EgRXllSKkjDFMvXi8zk1U09vc2LHVdlTEw2udfT5v0hXDKhtYo1oFnBHvB9itvkf1-TTNPdfHH3qCXyrMcdR_1zgy9q5dTXAWviIS_R0cdXKvlpSNvvsFPtRnz1HbMj=w388-h306-no?authuser=0');
INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(3, 'X-Egg', 'https://lh3.googleusercontent.com/pw/ACtC-3c4-8PMkxPUAHzl_TNq2LJF7U37iWelNA8QUMUClvgJxAHnCFikgLDaqYAUnbbzffzyYLaOt41BU_f-7x449TxDsA66VrLYw--ylIwRmNzxeFets4iUGIHF71TWAOQdldJcsYQwHHQC6_o3n28BEkDq=w388-h253-no?authuser=0');
INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(4, 'X-Egg Bacon', 'https://lh3.googleusercontent.com/pw/ACtC-3cPYCwspYjpmQ1y1Q2_GA6v8tB1T5_Ezempxhi-ytSGjtsr0QPaEnLA1ggeycC9dgVHuCsmyzVkCfUlJVRtMPWUJZGmZ-iWt32AEhCQbtBDjF-CXPc1vPBsA_-is8GU8vTI_JWd9t5lYnGtUPif8wkn=w388-h283-no?authuser=0');
INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(5, 'Lanche Personalizado', null);
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(1, 'Alface', 0.40, 'https://lh3.googleusercontent.com/pw/ACtC-3c4Kl3QaB0ukxQXfeWDvEz1jtnnUSOQ8Gnr3r5dTnuzGzcj3t6HlioBb5xLHs8pW1oazPIGr6TiUdGluNi7uRRT8LVxZx-5ZX8mblDPcJDjUSEPHz4kzf9FD6F_L5NmsQM9RMQLN0IF2cfIjVsSPdXy=s300-no?authuser=0');
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(2, 'Bacon', 2.00, 'https://lh3.googleusercontent.com/pw/ACtC-3c4Kl3QaB0ukxQXfeWDvEz1jtnnUSOQ8Gnr3r5dTnuzGzcj3t6HlioBb5xLHs8pW1oazPIGr6TiUdGluNi7uRRT8LVxZx-5ZX8mblDPcJDjUSEPHz4kzf9FD6F_L5NmsQM9RMQLN0IF2cfIjVsSPdXy=s300-no?authuser=0');
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(3, 'Hambúrguer de carne', 3.00, 'https://lh3.googleusercontent.com/pw/ACtC-3c4Kl3QaB0ukxQXfeWDvEz1jtnnUSOQ8Gnr3r5dTnuzGzcj3t6HlioBb5xLHs8pW1oazPIGr6TiUdGluNi7uRRT8LVxZx-5ZX8mblDPcJDjUSEPHz4kzf9FD6F_L5NmsQM9RMQLN0IF2cfIjVsSPdXy=s300-no?authuser=0');
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(4, 'Ovo', 0.80, 'https://lh3.googleusercontent.com/pw/ACtC-3c4Kl3QaB0ukxQXfeWDvEz1jtnnUSOQ8Gnr3r5dTnuzGzcj3t6HlioBb5xLHs8pW1oazPIGr6TiUdGluNi7uRRT8LVxZx-5ZX8mblDPcJDjUSEPHz4kzf9FD6F_L5NmsQM9RMQLN0IF2cfIjVsSPdXy=s300-no?authuser=0');
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(5, 'Queijo', 1.50, 'https://lh3.googleusercontent.com/pw/ACtC-3c4Kl3QaB0ukxQXfeWDvEz1jtnnUSOQ8Gnr3r5dTnuzGzcj3t6HlioBb5xLHs8pW1oazPIGr6TiUdGluNi7uRRT8LVxZx-5ZX8mblDPcJDjUSEPHz4kzf9FD6F_L5NmsQM9RMQLN0IF2cfIjVsSPdXy=s300-no?authuser=0');

INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(1, 2);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(1, 3);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(1, 5);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(2, 3);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(2, 5);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(3, 4);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(3, 3);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(3, 5);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(4, 4);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(4, 2);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(4, 3);
INSERT INTO public.lancheingrediente
(lancheid, ingredienteid)
VALUES(4, 5);
