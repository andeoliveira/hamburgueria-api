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
