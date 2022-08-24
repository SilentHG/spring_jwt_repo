INSERT INTO trades (id, symbol, price, quantity, trade_time) VALUES (1, 'BTCUSDT', 24000.65, 0.0000054, CURRENT_TIME());

INSERT INTO trades (id, symbol, price, quantity, trade_time) VALUES (2, 'XRPUSDT', 2.65, 24, CURRENT_TIME());

INSERT INTO trades (id, symbol, price, quantity, trade_time) VALUES (3, 'LTCUSDT', 68.65, 25.20, CURRENT_TIME());

INSERT INTO trades (id, symbol, price, quantity, trade_time) VALUES (4, 'DOGEUSDT', 0.65, 32.11, CURRENT_TIME());
--
INSERT INTO trades (id, symbol, price, quantity, trade_time) VALUES (5, 'WAVESUSDT', 6.65, 66.14, CURRENT_TIME());

INSERT INTO users (id, user_name, password, active, roles)  VALUES (1,'user', 'pass', 'true' , 'ROLE_ADMIN');