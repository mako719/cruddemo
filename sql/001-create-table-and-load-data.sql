DROP TABLE IF EXISTS team;

CREATE TABLE teams (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  league VARCHAR(100) NOT NULL,
  founding_year int(4) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO teams (id, name, league, founding_year) VALUES (1, "LiverpoolFC", "PremierLeague", 1892);
INSERT INTO teams (id, name, league, founding_year) VALUES (2, "FCBarcelona", "LaLiga", 1899);
INSERT INTO teams (id, name, league, founding_year) VALUES (3, "ParisSaint-GermainFC", "LIGUE1", 1932);
INSERT INTO teams (id, name, league, founding_year) VALUES (4, "InternazionaleMilano", "SERIEA", 1898);
INSERT INTO teams (id, name, league, founding_year) VALUES (5, "FCBayernMunchen", "BUNDESLIGA", 1900);
