INSERT INTO roles (id, name) VALUES (1, 'ROLE_ADMIN'), (2, 'ROLE_USER');
INSERT INTO users (id, username, password) VALUES (1, 'admin', 'admin');
INSERT INTO users_roles VALUES (1, 1);