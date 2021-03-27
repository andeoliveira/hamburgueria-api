INSERT INTO public.lanche
(id, nome)
VALUES(1, 'X-Bacon');
INSERT INTO public.lanche
(id, nome)
VALUES(2, 'X-Burger');
INSERT INTO public.lanche
(id, nome)
VALUES(3, 'X-Egg');
INSERT INTO public.lanche
(id, nome)
VALUES(4, 'X-Egg Bacon');
INSERT INTO public.lanche
(id, nome)
VALUES(5, 'Lanche Personalizado');
INSERT INTO public.ingrediente
(id, nome, valor)
VALUES(1, 'Alface', 0.40);
INSERT INTO public.ingrediente
(id, nome, valor)
VALUES(2, 'Bacon', 2.00);
INSERT INTO public.ingrediente
(id, nome, valor)
VALUES(3, 'Hambúrguer de carne', 3.00);
INSERT INTO public.ingrediente
(id, nome, valor)
VALUES(4, 'Ovo', 0.80);
INSERT INTO public.ingrediente
(id, nome, valor)
VALUES(5, 'Queijo', 1.50);

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

INSERT INTO public.promocao
(id, descricao, nome)
VALUES(1, 'Promo Light! Tem alface e não tem bacon, ganha 10% de desconto.', 'Light');
INSERT INTO public.promocao
(id, descricao, nome)
VALUES(2, 'Promo Muita carne! A cada 3 porções de carne o cliente só paga 2!', 'Muita carne');
INSERT INTO public.promocao
(id, descricao, nome)
VALUES(3, 'Promo Muito queijo! A cada 3 porções de queijo o cliente só paga 2!', 'Muito queijo');
