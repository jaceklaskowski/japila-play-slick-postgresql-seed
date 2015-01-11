Japila Software's Play with Slick and PostgreSQL Seed
=================================

A Play Framework project using Slick to access data in PostgreSQL database.

## Set up PostgreSQL

1. Create `sandbox` database using `createdb sandbox`.
1. Start PostgreSQL using `postgres -D /usr/local/var/postgres` (or whatever command is suitable for your development environment).
1. Check out the `sandbox` database using `psql`.

		➜  ~  psql
		psql (9.4.0)
		Type "help" for help.

		jacek=# \c sandbox
		You are now connected to database "sandbox" as user "jacek".
		sandbox=# \dt
		         List of relations
		 Schema |   Name    | Type  | Owner
		--------+-----------+-------+-------
		(0 rows)
