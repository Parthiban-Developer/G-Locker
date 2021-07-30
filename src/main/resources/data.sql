INSERT INTO racker (id, created_at, created_by, updated_at, updated_by, display_name, lat, lng, is_available, dimension, measurement, address1, address2) VALUES (1, current_timestamp, 'admin', current_timestamp, 'admin', 'defRacker1', '13.3105', '80.0441', 'Y', '10,5', '500', 'Bhavani Amman Koil, Periyapalayam', 'Tiruvallur, Tamil Nadu.601102');

INSERT INTO locker (id, created_at, created_by, updated_at, updated_by, dimension, display_name, is_available, measurement, racker_id) VALUES (1, current_timestamp, 'admin', current_timestamp, 'admin', '3,4', 'defLocker1', 'Y', '250', 1);
