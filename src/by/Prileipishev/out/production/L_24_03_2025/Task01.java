package by.Prileipishev.out.production.L_24_03_2025;

import by.Prileipishev.out.production.L_24_03_2025.permission.Permission;
import by.Prileipishev.out.production.L_24_03_2025.permission.Role;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;

public class Task01 {

    public static void main(String[] args) {
        EnumMap<Role, Integer> roleIntegerEnumMap = new EnumMap<>(Role.class);
        roleIntegerEnumMap.put(Role.USER, 10);
        roleIntegerEnumMap.put(Role.GUEST, 30);
        roleIntegerEnumMap.put(Role.ADMIN, 3);


        System.out.println("Количество пользователей по ролям");

        for (Map.Entry<Role, Integer> entry : roleIntegerEnumMap.entrySet()) {
            Role role = entry.getKey();
            int num = entry.getValue();

            System.out.println(role.getPermissions() + " : " + num);
        }

        System.out.println("Права пользователя юзер");

        Role userRole = Role.USER;
        EnumSet<Permission> userPermissions = userRole.getPermissions();

        for (Permission userPermission : userPermissions) {
            System.out.println(userPermission);
            System.out.println(userPermission.getDescription());
        }

        for (Role value : Role.values()) {
            System.out.println(value.name());
        }


    }

}
