DROP TABLE IF EXISTS team;

CREATE TABLE teams (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  league VARCHAR(100) NOT NULL,
  founding_year int(4) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO teams (id, name, league, founding_year) VALUES (1, "liverpoolfc", "PremierLeague", 1892);
INSERT INTO teams (id, name, league, founding_year) VALUES (2, "fcbarcelona", "LaLiga", 1899);
INSERT INTO teams (id, name, league, founding_year) VALUES (3, "parissaint-germainfc", "LIGUE1", 1932);
INSERT INTO teams (id, name, league, founding_year) VALUES (4, "internazionalemilano", "SERIEA", 1898);
INSERT INTO teams (id, name, league, founding_year) VALUES (5, "fcbayernmunchen", "BUNDESLIGA", 1900);
