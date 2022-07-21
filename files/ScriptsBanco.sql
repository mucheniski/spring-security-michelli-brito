INSERT INTO public.tb_user
(user_id, "password", username)
VALUES('37b3fabd-50a0-444b-a804-8601ef3e00c7', '$2a$10$VLsRfnxMKVzYEBfv8I36P.EKr2A5z029vMqTZXBJD0ikjFnInsQxW', 'noah');

INSERT INTO public.tb_user
(user_id, "password", username)
VALUES('68a9707c-8f20-4b1e-8280-14d461325daa', '$2a$10$VLsRfnxMKVzYEBfv8I36P.EKr2A5z029vMqTZXBJD0ikjFnInsQxW', 'bruna');

INSERT INTO public.tb_role
(role_id, role_name)
VALUES('5545a9da-b323-41e1-9ca6-373b2e02f5ed', 'ROLE_ADMIN');

INSERT INTO public.tb_role
(role_id, role_name)
VALUES('2938ea93-e689-4063-b74d-66b18119e890', 'ROLE_USER');

INSERT INTO public.tb_user_roles
(user_id, role_id)
VALUES('37b3fabd-50a0-444b-a804-8601ef3e00c7', '2938ea93-e689-4063-b74d-66b18119e890');

INSERT INTO public.tb_user_roles
(user_id, role_id)
VALUES('68a9707c-8f20-4b1e-8280-14d461325daa', '5545a9da-b323-41e1-9ca6-373b2e02f5ed');

INSERT INTO public.tb_user_roles
(user_id, role_id)
VALUES('68a9707c-8f20-4b1e-8280-14d461325daa', '2938ea93-e689-4063-b74d-66b18119e890');


select tb_user.username,
	   tb_role.role_name
from tb_user 
join tb_user_roles on 
tb_user.user_id = tb_user_roles.user_id
join tb_role on 
tb_user_roles.role_id = tb_role.role_id;
