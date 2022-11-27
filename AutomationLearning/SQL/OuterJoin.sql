SELECT 
    member_name, 
    project_name
FROM 
    members m
FULL OUTER JOIN projects p ON p.project_id = m.project_id
ORDER BY 
    member_name;    
