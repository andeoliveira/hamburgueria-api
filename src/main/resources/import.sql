INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(1, 'X-Bacon', 'https://lh3.google.com/pw/ACtC-3cs-p72UWWc-pmE39Vgr_rBsriKt10d3szhcys43Mi4egaVEADEKZAaADBPMKnKhKupkNVDEZmJ1q3xytopfdOiBRnPGJY=s380-no?authuser=0');
INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(2, 'X-Burger','https://lh3.google.com/pw/ACtC-3eOao8ieCFtMlpDM2bWhDwHQaP8o-3WGhOvoKQY5OBwpqC_tJp3Aw17VSb8q-_WEiXCrbGczRwZsCsQcJ5gH4CXy2ZgPaA=s380-no?authuser=0');
INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(3, 'X-Egg', 'https://lh3.google.com/pw/ACtC-3eTdJE8_BVhmMTlvWrJf85Ly_WJhPa0nhz6QHCTJY4i4xVhUjiqL0PWQCqEa1qEGjBVQSKNb1h9HRz6poCuF5sEjEw-A7g=s380-no?authuser=0');
INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(4, 'X-Egg Bacon', 'https://lh3.google.com/pw/ACtC-3eBmZ4n30Z1K3wseJJ9oCrirMUfXZedmilz8Pi-rQErGp9vx-jOQ-jNtIE5C59LXSA8V_9EBTpt2ziy4LnobP36vePw_Ps=s380-no?authuser=0');
INSERT INTO public.lanche
(id, nome, urlimagem)
VALUES(5, 'Lanche Personalizado', null);
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(1, 'Alface', 0.40, 'https://lh3.google.com/pw/ACtC-3cpHKOElpS2Ofi9nhEcSvQxxk17UWGGvsWXOCu2DxSNlFw5Q5yPM5rUnGTMDlVQoCNF1JXfCYsPEF2VP8OQ2IG_mo3sujU=s380-no?authuser=0');
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(2, 'Bacon', 2.00, 'https://lh3.google.com/pw/ACtC-3fKPbGQRviHfeld0adE8RkuSG5Mx3qwLuaz4jrV9KjfzOmFCEVzCpsc8S3QK7MrYtaOp4WSgHTJId0rP7eHTLb1a8zHmKA=s380-no?authuser=0');
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(3, 'Hambúrguer de carne', 3.00, 'https://lh3.google.com/pw/ACtC-3fpn_XZaUyryXtnvv_X0VzxHRoMBVLLetHaxvsv7SvAd9FCJDgfxdzycf3H4_gpakcSkPSXdEbikOMtJYsEAQ2g4ax-vS0=s380-no?authuser=0');
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(4, 'Ovo', 0.80, 'https://lh3.google.com/pw/ACtC-3etIH4NlxEefYswnbq2YPi0AVHAfuGQWjomxllvHRDYYEKurExdg7nttxXyTAJEHrYYVMo3XL9qINpWuGVcvgI3uGbQ_JE=s380-no?authuser=0');
INSERT INTO public.ingrediente
(id, nome, valor, urlimagem)
VALUES(5, 'Queijo', 1.50, 'https://lh3.google.com/pw/ACtC-3f62X3ErVZ061cvC5ZYpD5jrYhQVgwqOccwoCnjcekPKzmEAHgR7bRQWm9kjGCQZNL-6vg6ND6tWraXP3564eg2x6gAw2E=s380-no?authuser=0');

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
