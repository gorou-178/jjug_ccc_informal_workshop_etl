CREATE TABLE IF NOT EXISTS address (
    id IDENTITY PRIMARY KEY,
    jlg_code VARCHAR(6) NOT NULL,
    old_postal_code VARCHAR(5) NOT NULL,
    postal_code VARCHAR(7) NOT NULL,
    prefecture_kana VARCHAR(50) NOT NULL,
    city_kana VARCHAR(50) NOT NULL,
    town_kana VARCHAR(50) NOT NULL,
    prefecture VARCHAR(50) NOT NULL,
    city VARCHAR(50) NOT NULL,
    town VARCHAR(50) NOT NULL,
    multiple_postal_codes CHAR(1) NOT NULL,
    special_town_name CHAR(1) NOT NULL,
    has_chome CHAR(1) NOT NULL,
    multiple_towns CHAR(1) NOT NULL,
    update_status CHAR(1) NOT NULL,
    update_reason CHAR(1) NOT NULL
);