CREATE UNIQUE INDEX idx_users_email ON users (email);
CREATE UNIQUE INDEX idx_teams_owner_id ON teams (owner_id);