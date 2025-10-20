-- --------------------------------------------------------
-- Esquema de Base de Datos para el Sistema de Reservas de Futsal
-- Usamos InnoDB para soportar Transacciones y Claves Foráneas.
-- --------------------------------------------------------

--
-- 1. Tabla de Usuarios (Para el Login y Roles)
--
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL COMMENT 'Usado como nombre de usuario para el login',
    password_hash VARCHAR(255) NOT NULL COMMENT 'Almacena la contraseña encriptada (hash)',
    rol ENUM('admin', 'cliente') NOT NULL DEFAULT 'cliente' COMMENT 'Define los permisos: admin o cliente',
    fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 2. Tabla de Canchas (Inventario gestionado por el Admin)
--
CREATE TABLE canchas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL UNIQUE COMMENT 'Nombre descriptivo de la cancha (Ej: Cancha Principal A)',
    capacidad INT NOT NULL COMMENT 'Capacidad de jugadores (Ej: 10 para 5v5)',
    precio_hora DECIMAL(10, 2) NOT NULL COMMENT 'Precio de reserva por hora',
    activa BOOLEAN NOT NULL DEFAULT TRUE COMMENT 'Indica si la cancha está disponible para reservar'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 3. Tabla de Reservas (El corazón del CRUD)
--
CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    
    -- Claves Foráneas para enlazar con Cancha y Cliente
    cancha_id INT NOT NULL,
    cliente_id INT NOT NULL,
    
    -- Detalles del Tiempo y Estado
    fecha_hora_inicio DATETIME NOT NULL COMMENT 'Fecha y hora de inicio de la reserva',
    fecha_hora_fin DATETIME NOT NULL COMMENT 'Fecha y hora de finalización de la reserva',
    estado ENUM('Pendiente', 'Aprobada', 'Rechazada', 'Cancelada') NOT NULL DEFAULT 'Pendiente' COMMENT 'Estado actual de la solicitud de reserva',
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    
    -- Definición de Claves Foráneas
    FOREIGN KEY (cancha_id) REFERENCES canchas(id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (cliente_id) REFERENCES usuarios(id) ON DELETE RESTRICT ON UPDATE CASCADE,
    
    -- Restricción para asegurar que la hora de inicio es anterior a la hora de fin
    CONSTRAINT chk_tiempo CHECK (fecha_hora_inicio < fecha_hora_fin)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para mejorar la búsqueda y evitar conflictos
--
CREATE INDEX idx_reserva_tiempo ON reservas (fecha_hora_inicio, fecha_hora_fin);
CREATE INDEX idx_reserva_estado ON reservas (estado);
