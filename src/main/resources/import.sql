INSERT INTO "roles" (`id`, `role`) VALUES (1, "ADMIN");
INSERT INTO "roles" (`id`, `role`) VALUES (2, "USER");

INSERT INTO `users` (`id`,`email`,`password`,`name`,`telefone`,"id_role") VALUES (1, "deyvison@mail.com", "deyvison123", "Deyvison Silva", "90000-0000", 2);
INSERT INTO `users` (`id`,`email`,`password`,`name`,`telefone`,"id_role") VALUES (2, "eglany@mail.com", "eglany123", "Eglany Junior", "90000-0000", 1);
INSERT INTO `users` (`id`,`email`,`password`,`name`,`telefone`,"id_role") VALUES (3, "hudson@mail.com", "hudson123", "Hudson Freitas", "90000-0000", 2);
INSERT INTO `users` (`id`,`email`,`password`,`name`,`telefone`,"id_role") VALUES (4, "ruan@mail.com", "ruan123", "Ruan", "90000-0000", 2);
INSERT INTO `users` (`id`,`email`,`password`,`name`,`telefone`,"id_role") VALUES (5, "igor@mail.com", "igor123", "Igor Bennet", "90000-0000", 2);
INSERT INTO `users` (`id`,`email`,`password`,`name`,`telefone`,"id_role") VALUES (6, "laura@mail.com", "laura123", "Laura Beatriz", "90000-0000", 2);
INSERT INTO `users` (`id`,`email`,`password`,`name`,`telefone`,"id_role") VALUES (7, "keven@mail.com", "keven123", "Keven Anjos", "90000-0000", 2);

