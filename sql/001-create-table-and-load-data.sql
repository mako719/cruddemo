DROP TABLE IF EXISTS team;

CREATE TABLE teams (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  league VARCHAR(100) NOT NULL,
  founding_year int(4) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO teams (id, name, league, founding_year) VALUES (1, "Liverpool FC", "Premier League", 1892);
INSERT INTO teams (id, name, league, founding_year) VALUES (2, "FC Barcelona", "LaLiga", 1899);
INSERT INTO teams (id, name, league, founding_year) VALUES (3, "Paris Saint-Germain FC", "LIGUE 1", 1932);
INSERT INTO teams (id, name, league, founding_year) VALUES (4, "Internazionale Milano", "SERIE A", 1898);
INSERT INTO teams (id, name, league, founding_year) VALUES (5, "FC Bayern Munchen", "BUNDESLIGA", 1900);
